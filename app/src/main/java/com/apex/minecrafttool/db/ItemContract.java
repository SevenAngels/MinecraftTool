package com.apex.minecrafttool.db;

import android.provider.BaseColumns;

/**
 * Created by Adam on 9/1/2017.
 * Handles SQLite database connection.
 */

final class ItemContract {

    static final String CREATE_ITEM_TABLE =
            "CREATE TABLE " + ItemEntry.TABLE_NAME + " ( " +
                    ItemEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    ItemEntry.COLUMN_ITEM_NAME + " TEXT NOT NULL, " +
                    ItemEntry.COLUMN_TECHNICAL_NAME + " TEXT NOT NULL, " +
                    ItemEntry.COLUMN_ITEM_ID + " INTEGER NOT NULL, " +
                    ItemEntry.COLUMN_IMAGE_NAME + " TEXT NOT NULL, " +
                    ItemEntry.COLUMN_ITEM_CATEGORY + " TEXT NOT NULL, " +
                    ItemEntry.COLUMN_STACK_AMOUNT + " INTEGER NOT NULL, " +
                    "UNIQUE ( " + ItemEntry._ID + " ) ON CONFLICT REPLACE)";

    static class ItemEntry implements BaseColumns {
        static final String TABLE_NAME = "item";
        static final String COLUMN_ITEM_NAME = "item_name";
        static final String COLUMN_TECHNICAL_NAME = "technical_name";
        static final String COLUMN_ITEM_ID = "item_id";
        static final String COLUMN_IMAGE_NAME = "image_name";
        static final String COLUMN_ITEM_CATEGORY = "item_type";
        static final String COLUMN_STACK_AMOUNT = "stack_amount";
    }
}
