package com.apex.minecrafttool.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.apex.minecrafttool.items.Item;

/**
 * Created by Adam on 9/1/2017.
 * Handles data flow between the SQLite database and the application.
 */

public class ItemDataSource {
    private static final String TAG = ItemDataSource.class.getSimpleName();
    private SQLiteDatabase database;
    private DatabaseSQLiteOpenHelper dbHelper;

    public ItemDataSource(Context context) {
        this.dbHelper = new DatabaseSQLiteOpenHelper(context);
    }

    public void open() {
        this.database = dbHelper.getWritableDatabase();

        Log.d(TAG, "database opened successfully");
    }

    public void close() {
        dbHelper.close();

        Log.d(TAG, "database connection closed.");
    }

    public void createItem(Item item) {
        ContentValues values = new ContentValues();
        values.put(ItemContract.ItemEntry.COLUMN_ITEM_NAME, item.getName());
        values.put(ItemContract.ItemEntry.COLUMN_TECHNICAL_NAME, item.getTechnicalName());
        values.put(ItemContract.ItemEntry.COLUMN_ITEM_ID, item.getItemID());
        values.put(ItemContract.ItemEntry.COLUMN_IMAGE_NAME, item.getImageName());
        values.put(ItemContract.ItemEntry.COLUMN_ITEM_CATEGORY, item.getItemCategory().toString());
        database.insert(ItemContract.ItemEntry.TABLE_NAME, null, values);

        long rowID = database.insert(ItemContract.ItemEntry.TABLE_NAME, null, values);

        Log.d(TAG, "item with id: " + rowID);
    }
}
