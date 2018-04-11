package com.example.kaushal97.busbay;


import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kaushal97 on 26/3/18.
 */

public  class database extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Mydb.db";
    public static final String TABLE_NAME = "busdetail2";
    public static final String TABLE_ID = "id";
    public static final String BUSN = "busN";
    public static final String STATION = "station";
    public static final String RSTATION = "rstation";
    public static final String ATIME = "atime";

    public database(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL("Drop Table IF exists contacts");
    }

    public boolean insertValues(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("create table busdetail3" + "(id integer primary key,busN integer,station text,rstation text,atime text)");
        db.execSQL("Insert into busdetail3 values(1,1001,'kharar','sector 17','09:00')");
        db.execSQL("Insert into busdetail3 values(2,1001,'kharar','sector 14','09:30')");
        db.execSQL("Insert into busdetail3 values(3,1001,'sector 17','sector 14','10:00')");
        db.execSQL("Insert into busdetail3 values(4,1001,'sector 17','kharar','11:00')");
        db.execSQL("Insert into busdetail3 values(5,1001,'sector 14','sector 17','12:00')");
        db.execSQL("Insert into busdetail3 values(6,1001,'sector 14','kharar','14:00')");

        db.execSQL("Insert into busdetail3 values(7,1002,'sector 17','sector 14','09:00')");
        db.execSQL("Insert into busdetail3 values(8,1002,'sector 17','sector 43','10:30')");
        db.execSQL("Insert into busdetail3 values(9,1002,'sector 17','mohali','12:00')");
        db.execSQL("Insert into busdetail3 values(10,1002,'sector 14','sector 43','13:30')");
        db.execSQL("Insert into busdetail3 values(11,1002,'sector 14','mohali','14:45')");
        db.execSQL("Insert into busdetail3 values(12,1002,'sector 14','sector 17','17:30')");
        db.execSQL("Insert into busdetail3 values(13,1002,'sector 43','mohali','14:30')");
        db.execSQL("Insert into busdetail3 values(14,1002,'sector 43','sector 14','16:30')");
        db.execSQL("Insert into busdetail3 values(15,1002,'sector 43','sector 17','19:30')");
        db.execSQL("Insert into busdetail3 values(16,1002,'mohali','sector 43','15:30')");
        db.execSQL("Insert into busdetail3 values(17,1002,'mohali','sector 14','17:30')");
        db.execSQL("Insert into busdetail3 values(18,1002,'mohali','sector 17','20:30')");

        db.execSQL("Insert into busdetail3 values(19,1003,'sector 15','sector 20','09:30')");
        db.execSQL("Insert into busdetail3 values(20,1003,'sector 15','sector 22','11:30')");
        db.execSQL("Insert into busdetail3 values(21,1003,'sector 15','sector 43','13:30')");
        db.execSQL("Insert into busdetail3 values(22,1003,'sector 20','sector 22','11:30')");
        db.execSQL("Insert into busdetail3 values(23,1003,'sector 20','sector 43','14:30')");
        db.execSQL("Insert into busdetail3 values(24,1003,'sector 20','sector 15','18:45')");
        db.execSQL("Insert into busdetail3 values(25,1003,'sector 22','sector 43','15:30')");
        db.execSQL("Insert into busdetail3 values(26,1003,'sector 22','sector 20','17:30')");
        db.execSQL("Insert into busdetail3 values(27,1003,'sector 22','sector 15','20:30')");
        db.execSQL("Insert into busdetail3 values(28,1003,'sector 43','sector 22','15:30')");
        db.execSQL("Insert into busdetail3 values(29,1003,'sector 43','sector 20','18:30')");
        db.execSQL("Insert into busdetail3 values(30,1003,'sector 43','sector 15','20:30')");

        db.execSQL("Insert into busdetail3 values(31,1004,'kharar','sector 17','09:00')");
        db.execSQL("Insert into busdetail3 values(32,1004,'sector 17','kharar','11:00')");
        db.execSQL("Insert into busdetail3 values(33,1004,'sector 17','sector 43','10:30')");
        db.execSQL("Insert into busdetail3 values(34,1004,'sector 43','mohali','14:30')");
        db.execSQL("Insert into busdetail3 values(35,1004,'mohali','sector 17','20:30')");
        db.execSQL("Insert into busdetail3 values(36,1004,'sector 43','sector 22','15:30')");
        db.execSQL("Insert into busdetail3 values(37,1004,'sector 20','sector 15','18:45')");
        db.execSQL("Insert into busdetail3 values(38,1004,'sector 15','sector 20','16:30')");
        db.execSQL("Insert into busdetail3 values(39,1004,'sector 20','sector 43','14:30')");
        db.execSQL("Insert into busdetail3 values(40,1004,'sector 43','sector 17','19:30')");
        db.execSQL("Insert into busdetail3 values(41,1004,'sector 17','kharar','21:00')");



        db.execSQL("Insert into busdetail3 values(42,1005,'sector 17','sector 43','10:00')");
        db.execSQL("Insert into busdetail3 values(43,1005,'sector 17','sector 19','20:00')");
        db.execSQL("Insert into busdetail3 values(44,1005,'sector 17','sector 60','18:00')");
        db.execSQL("Insert into busdetail3 values(45,1005,'sector 43','sector 19','11:30')");
        db.execSQL("Insert into busdetail3 values(46,1005,'sector 43','sector 60','10:00')");
        db.execSQL("Insert into busdetail3 values(47,1005,'sector 43','sector 17','17:30')");
        db.execSQL("Insert into busdetail3 values(48,1005,'sector 19','sector 60','14:30')");
        db.execSQL("Insert into busdetail3 values(49,1005,'sector 19','sector 43','13:00')");
        db.execSQL("Insert into busdetail3 values(50,1005,'sector 19','sector 17','15:00')");
        db.execSQL("Insert into busdetail3 values(51,1005,'sector 60','sector 19','09:30')");
        db.execSQL("Insert into busdetail3 values(52,1005,'sector 60','sector 43','16:30')");
        db.execSQL("Insert into busdetail3 values(53,1005,'sector 60','sector 17','19:00')");



        db.execSQL("Insert into busdetail3 values(54,1006,'sector 17','sector 14','13:00')");
        db.execSQL("Insert into busdetail3 values(55,1006,'sector 17','sector 43','16:30')");
        db.execSQL("Insert into busdetail3 values(56,1006,'sector 17','mohali','15:00')");
        db.execSQL("Insert into busdetail3 values(57,1006,'sector 14','sector 43','09:30')");
        db.execSQL("Insert into busdetail3 values(58,1006,'sector 14','mohali','11:45')");
        db.execSQL("Insert into busdetail3 values(59,1006,'sector 14','sector 17','19:30')");
        db.execSQL("Insert into busdetail3 values(60,1006,'sector 43','mohali','20:30')");
        db.execSQL("Insert into busdetail3 values(61,1006,'sector 43','sector 14','12:30')");
        db.execSQL("Insert into busdetail3 values(62,1006,'sector 43','sector 17','13:30')");
        db.execSQL("Insert into busdetail3 values(63,1006,'mohali','sector 43','11:30')");
        db.execSQL("Insert into busdetail3 values(64,1006,'mohali','sector 14','21:30')");
        db.execSQL("Insert into busdetail3 values(65,1006,'mohali','sector 17','20:30')");



        db.execSQL("Insert into busdetail3 values(66,1007,'kharar','sector 17','19:00')");
        db.execSQL("Insert into busdetail3 values(67,1007,'sector 17','kharar','13:00')");
        db.execSQL("Insert into busdetail3 values(68,1007,'sector 17','sector 43','16:30')");
        db.execSQL("Insert into busdetail3 values(69,1007,'sector 43','mohali','09:30')");
        db.execSQL("Insert into busdetail3 values(70,1007,'mohali','sector 17','21:30')");
        db.execSQL("Insert into busdetail3 values(71,1007,'sector 43','sector 22','11:30')");
        db.execSQL("Insert into busdetail3 values(72,1007,'sector 20','sector 15','14:45')");
        db.execSQL("Insert into busdetail3 values(73,1007,'sector 15','sector 20','12:30')");
        db.execSQL("Insert into busdetail3 values(74,1007,'sector 20','sector 43','10:30')");
        db.execSQL("Insert into busdetail3 values(75,1007,'sector 43','sector 17','15:30')");
        db.execSQL("Insert into busdetail3 values(76,1007,'sector 17','kharar','17:00')");
        db.execSQL("Insert into busdetail3 values(77,1008,'sector 22','sector 14','15:00')");
        db.execSQL("Insert into busdetail3 values(78,1008,'sector 22','kharar','11:05')");
        db.execSQL("Insert into busdetail3 values(79,1008,'sector 22','mohali','13:25')");
        db.execSQL("Insert into busdetail3 values(80,1008,'sector 14','kharar','12:00')");
        db.execSQL("Insert into busdetail3 values(81,1008,'sector 14','mohali','13:20')");
        db.execSQL("Insert into busdetail3 values(82,1008,'sector 14','sector 22','14:10')");
        db.execSQL("Insert into busdetail3 values(83,1008,'kharar','mohali','22:25')");
        db.execSQL("Insert into busdetail3 values(84,1008,'kharar','sector 14','13:00')");
        db.execSQL("Insert into busdetail3 values(85,1008,'kharar','sector 22','14:40')");
        db.execSQL("Insert into busdetail3 values(86,1008,'mohali','kharar','18:50')");
        db.execSQL("Insert into busdetail3 values(87,1008,'mohali','sector 14','19:00')");
        db.execSQL("Insert into busdetail3 values(88,1008,'mohali','sector 22','21:18')");
        return true;

    }

    public boolean insertValuesx(){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("create table busbikana" + "(id integer primary key,busN integer,station text,rstation text,atime text)");
        db.execSQL("Insert into busbikana values(1,1001,'murlidhar','mukta prasad','09:00')");
        db.execSQL("Insert into busbikana values(2,1001,'murlidhar','baheti chowk','09:30')");
        db.execSQL("Insert into busbikana values(3,1001,'mukta prasad','baheti chowk','10:00')");
        db.execSQL("Insert into busbikana values(4,1001,'mukta prasad','murlidhar','11:00')");
        db.execSQL("Insert into busbikana values(5,1001,'baheti chowk','mukta prasad','12:00')");
        db.execSQL("Insert into busbikana values(6,1001,'baheti chowk','murlidhar','14:00')");

        db.execSQL("Insert into busbikana values(7,1002,'mukta prasad','baheti chowk','09:00')");
        db.execSQL("Insert into busbikana values(8,1002,'mukta prasad','gopeshwar basti','10:30')");
        db.execSQL("Insert into busbikana values(9,1002,'mukta prasad','city','12:00')");
        db.execSQL("Insert into busbikana values(10,1002,'baheti chowk','gopeshwar basti','13:30')");
        db.execSQL("Insert into busbikana values(11,1002,'baheti chowk','city','14:45')");
        db.execSQL("Insert into busbikana values(12,1002,'baheti chowk','mukta prasad','17:30')");
        db.execSQL("Insert into busbikana values(13,1002,'gopeshwar basti','city','14:30')");
        db.execSQL("Insert into busbikana values(14,1002,'gopeshwar basti','baheti chowk','16:30')");
        db.execSQL("Insert into busbikana values(15,1002,'gopeshwar basti','mukta prasad','19:30')");
        db.execSQL("Insert into busbikana values(16,1002,'city','gopeshwar basti','15:30')");
        db.execSQL("Insert into busbikana values(17,1002,'city','baheti chowk','17:30')");
        db.execSQL("Insert into busbikana values(18,1002,'city','mukta prasad','20:30')");

        db.execSQL("Insert into busbikana values(19,1003,'kotegate','gangashahar','09:30')");
        db.execSQL("Insert into busbikana values(20,1003,'kotegate','lalgarh','11:30')");
        db.execSQL("Insert into busbikana values(21,1003,'kotegate','gopeshwar basti','13:30')");
        db.execSQL("Insert into busbikana values(22,1003,'gangashahar','lalgarh','11:30')");
        db.execSQL("Insert into busbikana values(23,1003,'gangashahar','gopeshwar basti','14:30')");
        db.execSQL("Insert into busbikana values(24,1003,'gangashahar','kotegate','18:45')");
        db.execSQL("Insert into busbikana values(25,1003,'lalgarh','gopeshwar basti','15:30')");
        db.execSQL("Insert into busbikana values(26,1003,'lalgarh','gangashahar','17:30')");
        db.execSQL("Insert into busbikana values(27,1003,'lalgarh','kotegate','20:30')");
        db.execSQL("Insert into busbikana values(28,1003,'gopeshwar basti','lalgarh','15:30')");
        db.execSQL("Insert into busbikana values(29,1003,'gopeshwar basti','gangashahar','18:30')");
        db.execSQL("Insert into busbikana values(30,1003,'gopeshwar basti','kotegate','20:30')");

        db.execSQL("Insert into busbikana values(31,1004,'murlidhar','mukta prasad','09:00')");
        db.execSQL("Insert into busbikana values(32,1004,'mukta prasad','murlidhar','11:00')");
        db.execSQL("Insert into busbikana values(33,1004,'mukta prasad','gopeshwar basti','10:30')");
        db.execSQL("Insert into busbikana values(34,1004,'gopeshwar basti','city','14:30')");
        db.execSQL("Insert into busbikana values(35,1004,'city','mukta prasad','20:30')");
        db.execSQL("Insert into busbikana values(36,1004,'gopeshwar basti','lalgarh','15:30')");
        db.execSQL("Insert into busbikana values(37,1004,'gangashahar','kotegate','18:45')");
        db.execSQL("Insert into busbikana values(38,1004,'kotegate','gangashahar','16:30')");
        db.execSQL("Insert into busbikana values(39,1004,'gangashahar','gopeshwar basti','14:30')");
        db.execSQL("Insert into busbikana values(40,1004,'gopeshwar basti','mukta prasad','19:30')");
        db.execSQL("Insert into busbikana values(41,1004,'mukta prasad','murlidhar','21:00')");



        db.execSQL("Insert into busbikana values(42,1005,'mukta prasad','gopeshwar basti','10:00')");
        db.execSQL("Insert into busbikana values(43,1005,'mukta prasad','junagarh','20:00')");
        db.execSQL("Insert into busbikana values(44,1005,'mukta prasad','jnv','18:00')");
        db.execSQL("Insert into busbikana values(45,1005,'gopeshwar basti','junagarh','11:30')");
        db.execSQL("Insert into busbikana values(46,1005,'gopeshwar basti','jnv','10:00')");
        db.execSQL("Insert into busbikana values(47,1005,'gopeshwar basti','mukta prasad','17:30')");
        db.execSQL("Insert into busbikana values(48,1005,'junagarh','jnv','14:30')");
        db.execSQL("Insert into busbikana values(49,1005,'junagarh','gopeshwar basti','13:00')");
        db.execSQL("Insert into busbikana values(50,1005,'junagarh','mukta prasad','15:00')");
        db.execSQL("Insert into busbikana values(51,1005,'jnv','junagarh','09:30')");
        db.execSQL("Insert into busbikana values(52,1005,'jnv','gopeshwar basti','16:30')");
        db.execSQL("Insert into busbikana values(53,1005,'jnv','mukta prasad','19:00')");



        db.execSQL("Insert into busbikana values(54,1006,'mukta prasad','baheti chowk','13:00')");
        db.execSQL("Insert into busbikana values(55,1006,'mukta prasad','gopeshwar basti','16:30')");
        db.execSQL("Insert into busbikana values(56,1006,'mukta prasad','city','15:00')");
        db.execSQL("Insert into busbikana values(57,1006,'baheti chowk','gopeshwar basti','09:30')");
        db.execSQL("Insert into busbikana values(58,1006,'baheti chowk','city','11:45')");
        db.execSQL("Insert into busbikana values(59,1006,'baheti chowk','mukta prasad','19:30')");
        db.execSQL("Insert into busbikana values(60,1006,'gopeshwar basti','city','20:30')");
        db.execSQL("Insert into busbikana values(61,1006,'gopeshwar basti','baheti chowk','12:30')");
        db.execSQL("Insert into busbikana values(62,1006,'gopeshwar basti','mukta prasad','13:30')");
        db.execSQL("Insert into busbikana values(63,1006,'city','gopeshwar basti','11:30')");
        db.execSQL("Insert into busbikana values(64,1006,'city','baheti chowk','21:30')");
        db.execSQL("Insert into busbikana values(65,1006,'city','mukta prasad','20:30')");



        db.execSQL("Insert into busbikana values(66,1007,'murlidhar','mukta prasad','19:00')");
        db.execSQL("Insert into busbikana values(67,1007,'mukta prasad','murlidhar','13:00')");
        db.execSQL("Insert into busbikana values(68,1007,'mukta prasad','gopeshwar basti','16:30')");
        db.execSQL("Insert into busbikana values(69,1007,'gopeshwar basti','city','09:30')");
        db.execSQL("Insert into busbikana values(70,1007,'city','mukta prasad','21:30')");
        db.execSQL("Insert into busbikana values(71,1007,'gopeshwar basti','lalgarh','11:30')");
        db.execSQL("Insert into busbikana values(72,1007,'gangashahar','kotegate','14:45')");
        db.execSQL("Insert into busbikana values(73,1007,'kotegate','gangashahar','12:30')");
        db.execSQL("Insert into busbikana values(74,1007,'gangashahar','gopeshwar basti','10:30')");
        db.execSQL("Insert into busbikana values(75,1007,'gopeshwar basti','mukta prasad','15:30')");
        db.execSQL("Insert into busbikana values(76,1007,'mukta prasad','murlidhar','17:00')");



        db.execSQL("Insert into busbikana values(77,1008,'lalgarh','baheti chowk','15:00')");
        db.execSQL("Insert into busbikana values(78,1008,'lalgarh','murlidhar','11:05')");
        db.execSQL("Insert into busbikana values(79,1008,'lalgarh','city','13:25')");
        db.execSQL("Insert into busbikana values(80,1008,'baheti chowk','murlidhar','12:00')");
        db.execSQL("Insert into busbikana values(81,1008,'baheti chowk','city','13:20')");
        db.execSQL("Insert into busbikana values(82,1008,'baheti chowk','lalgarh','14:10')");
        db.execSQL("Insert into busbikana values(83,1008,'murlidhar','city','22:25')");
        db.execSQL("Insert into busbikana values(84,1008,'murlidhar','baheti chowk','13:00')");
        db.execSQL("Insert into busbikana values(85,1008,'murlidhar','lalgarh','14:40')");
        db.execSQL("Insert into busbikana values(86,1008,'city','murlidhar','18:50')");
        db.execSQL("Insert into busbikana values(87,1008,'city','baheti chowk','19:00')");
        db.execSQL("Insert into busbikana values(88,1008,'city','lalgarh','21:18')");
return true;

    }

    public StringBuilder searchValues(String initial,String finalx,String city ) {
        if(city.equals("Chandigarh")){
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "Select * from busdetail3 where station like '%"+initial+"%' and rstation like '%"+finalx+"%'" ;
        Cursor mCursor = db.rawQuery(sql, null);
        if(mCursor==null){return null;}
        StringBuilder s=new StringBuilder();
        while (mCursor.moveToNext()) {
            s.append(mCursor.getInt(0)).append("_").append(mCursor.getInt(1)).append("_").
            append(mCursor.getString(2)).append("_")
                    .append(mCursor.getString(3)).append("_").append(mCursor.getString(4))
            .append("\n");
        }

        return s;
    }
    else{
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "Select * from busbikana where station like '%"+initial+"%' and rstation like '%"+finalx+"%'" ;
        Cursor mCursor = db.rawQuery(sql, null);
        if(mCursor==null){return null;}
        StringBuilder s=new StringBuilder();
        while (mCursor.moveToNext()) {
            s.append(mCursor.getInt(0)).append("_").append(mCursor.getInt(1)).append("_").
                    append(mCursor.getString(2)).append("_")
                    .append(mCursor.getString(3)).append("_").append(mCursor.getString(4))
                    .append("\n");
        }

        return s;
    }
}}