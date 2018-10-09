package com.example.android.mybooklist.data;

import android.provider.BaseColumns;

/**
 * API Contract for the BookCatalog app.
 */

public final class BookContract {
    private BookContract() {}

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {
        public static final String _ID = BaseColumns._ID;
        public static final String TABLE_NAME = "books";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_AUTHOR = "author";
        public static final String COLUMN_IMAGE = "image";
        public static final String COLUMN_GENRE = "genre";
        public static final String COLUMN_PUBLISHING_HOUSE = "publishing house";
        public static final String COLUMN_PUBLICATION_DATE = "publication date";
        public static final String COLUMN_LOCALIZATION = "localization";


        /**
         * Possible values for the genre of the book.
         */
        public static final int GENRE_UNKNOWN = 0;
        public static final int GENRE_THRILLER = 1;
        public static final int GENRE_GUIDE = 2;
        public static final int GENRE_NOVEL = 3;
        public static final int GENRE_BIOGRAPHY = 4;
        public static final int GENRE_FOR_KIDS = 5;
        public static final int GENRE_FANTASY = 6;
        public static final int GENRE_ROMANCE = 7;
        public static final int GENRE_SCIENTIFIC = 8;
    }
}
