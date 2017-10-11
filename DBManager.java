package com.sequence.mohammad.sequenceofnumbers;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.widget.Toast;

public class DBManager {
    private SQLiteDatabase sqlDB;
    static final String DBName="SequenceOfNumbers";
    static final String TableName="Sequence";

    static final String ColType="Type";
    static final String ColID="ID";

    static final String ColTF="trueOrFalse";
    static final String ColSeq="Sequence";
    static final String ColSol="Solution";
    static final String ColTypeName="TypeName";

    static final int DBVersion=11;


    static final String CreateTable="CREATE TABLE IF NOT EXISTS " +
            TableName+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, "+
            ColType+" TEXT, " +
            ColSeq+" TEXT, " +
            ColSol+" TEXT, " +
            ColTF+" TEXT, " +
            ColTypeName+" TEXT " +
            " );";



    static class DatabaseHelperUser extends SQLiteOpenHelper{
        Context context;
        DatabaseHelperUser(Context context){
            super(context,DBName,null,DBVersion);
            this.context=context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CreateTable);
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n1' , ' 1   3   5   7   9  ... ' , '11', 'next' , 'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n2' , ' 1   2   4   8   16  ... ' , '32', 'false' , 'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n3' , ' 1   11   112   1113  ... ' , '11114' , 'false' ,'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n4' , ' 1   21   32   43  ... ' , '54' , 'false' ,'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n5' , ' 6   61   612  ...  ' , '6123' , 'false' ,'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n6' , ' 1   4   3   6   5  ...  ' , '8' , 'false' ,'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n7' , ' 1   5   10   50  ...  ' , '100' , 'false' ,'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n8' , ' 3   11   43   171  ...  ' , '683' , 'false' ,'first' ); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null , 'n9' , ' 5   14   41   122  ...  ' , '365' , 'false' ,'first' ); ");

//
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n1', ' 0   2   6   12  ... ', '20', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n2', ' 2   6   10   16   ... ', '18', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n3', ' 0   3   8   15   ...  ', '24', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n4', ' 1   5   11   19   ...  ', '29', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n5', ' 0   8   16   24   ...  ', '32', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n6', ' 7   14   23   34   ...  ', '47', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n7', ' -4   37   78   119   ...  ', '160', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n8', ' 1   24   69   136   ...  ', '225', 'false' ,'second'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n9', ' 90   380   870   1560   ...  ', '2450', 'false' ,'second'); ");


            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n1',  ' 0   10   30   70  ... ', '150', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n2',  ' 1   4   13   40  ... ', '121', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n3',  ' 13   14   30   93  ... ', '376', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n4',  ' 0   4   36   64  ... ', '100', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n5',  ' 20   20   40   120  ... ', '480', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n6',  ' 5   8   9   8  ... ', '5', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n7',  ' 3   6   24   144  ... ', '1152', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n8',  ' 60   78   98   120  ... ', '144', 'false' ,'third'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n9',  ' 3   18   108   648  ... ', '3888', 'false' ,'third'); ");


            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n1', ' 1   5   25   125  ... ' , '625', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n2', ' 2   4   1  ... ', '6', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n3', ' 1   4   2   8  ... ', '4', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n4', ' 1   11   132   ... ', '1716', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n5', ' 100   20   10   ... ', '2', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n6', ' 60   120   180   90  ... ', '30', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n7', ' 1   60   10   3600  ... ', '600', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n8', ' 6   16   8   18  ... ', '9', 'false' ,'fourth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n9', ' 56   90   132   ... ', '182', 'false' ,'fourth'); ");


            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n1', ' 1   2   6   42  ... ', '1806', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n2', ' 1   11   121   ... ', '1331', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n3', ' 30   60   180   720  ... ', '3600', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n4', ' 12   24   48   96  ... ', '192', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n5', ' 4   24   12   72  ... ', '36', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n6', ' 35   32   27   20  ... ', '11', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n7', ' 6   120   504   1320  ... ', '2730', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n8', ' 10   18   24   28  ... ', '30', 'false' ,'fifth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n9', ' 50   36   24   14  ... ', '6', 'false' ,'fifth'); ");


            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n1', ' 1   16   27   16  ... ', '5', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n2', ' 8   32   96   ... ', '256', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n3', ' 8   18   24   ... ', '36', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n4', ' 1   2   18   64  ... ', '15625', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n5', ' 10   20   30   18  ... ', '2', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n6', ' 1   16   64   64  ... ', '16', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n7', ' 12   96   480   1920  ... ', '6720', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n8', ' 16   192   1536   10240  ... ', '61440', 'false' ,'sixth'); ");
            db.execSQL(" INSERT INTO "+TableName+" VALUES ( null, 'n9', ' 1   4   256   ... ', '16777216', 'false' ,'sixth'); ");

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("Drop table IF EXISTS "+TableName);
            onCreate(db);

        }
    }

    public DBManager(Context context){
        DatabaseHelperUser db=new DatabaseHelperUser(context);
        sqlDB = db.getWritableDatabase();
    }


    public long Insert(ContentValues values){
        long ID = sqlDB.insert(TableName,"",values);
        return ID;
    }


    public Cursor query(String[] Projection,String Selection, String[] SelectionArgs,String SortOrder){
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();
        qb.setTables(TableName);
        Cursor cursor=qb.query(sqlDB, Projection, Selection, SelectionArgs, null, null, SortOrder);
        return cursor;
    }

    public int Delete(String Selection,String[] SelectionArgs){
        int count = sqlDB.delete(TableName, Selection, SelectionArgs);
        return count;
    }

    public  int Update(ContentValues values,String Selection,String[] SelectionArgs){
        int count=sqlDB.update(TableName,values,Selection,SelectionArgs);
        return count;

    }

}
