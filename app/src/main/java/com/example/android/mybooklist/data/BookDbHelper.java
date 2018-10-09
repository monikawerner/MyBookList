package com.example.android.mybooklist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.mybooklist.data.BookContract.BookEntry;

/**
 * Database helper for BookCatalog app. Manages database creation and version management.
 */
    public class BookDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "books.db";
    public static final int DATABASE_VERSION = 1;
    private static final String SQL_DELETE_PRODUCTS_ENTRIES =
            "DROP TABLE IF EXISTS " + BookEntry.TABLE_NAME;

    public BookDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_BOOKS_TABLE = "CREATE TABLE " + BookEntry.TABLE_NAME + " ("
                + BookEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + BookEntry.COLUMN_TITLE + " TEXT NOT NULL, "
                + BookEntry.COLUMN_AUTHOR + " TEXT NOT NULL, "
                + BookEntry.COLUMN_IMAGE + " BLOB, "
                + BookEntry.COLUMN_GENRE + " INTEGER DEFAULT 0, "
                + BookEntry.COLUMN_PUBLISHING_HOUSE + " TEXT, "
                + BookEntry.COLUMN_PUBLICATION_DATE + " INTEGER, "
                + BookEntry.COLUMN_LOCALIZATION + " TEXT);";

        db.execSQL(SQL_CREATE_BOOKS_TABLE);
    }
    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_PRODUCTS_ENTRIES);
        onCreate(db);
    }
}
