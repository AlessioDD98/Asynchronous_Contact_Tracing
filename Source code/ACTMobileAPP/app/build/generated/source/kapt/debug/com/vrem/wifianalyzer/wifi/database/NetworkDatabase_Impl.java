package com.vrem.wifianalyzer.wifi.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NetworkDatabase_Impl extends NetworkDatabase {
  private volatile NetworkDao _networkDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Network` (`SSID` TEXT, `BSSID` TEXT NOT NULL, `TimeFound` INTEGER NOT NULL, `TimeLost` INTEGER, PRIMARY KEY(`BSSID`, `TimeFound`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7069eab6f71d25dc9de589a6d11e2abc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Network`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNetwork = new HashMap<String, TableInfo.Column>(4);
        _columnsNetwork.put("SSID", new TableInfo.Column("SSID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNetwork.put("BSSID", new TableInfo.Column("BSSID", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNetwork.put("TimeFound", new TableInfo.Column("TimeFound", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNetwork.put("TimeLost", new TableInfo.Column("TimeLost", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNetwork = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNetwork = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNetwork = new TableInfo("Network", _columnsNetwork, _foreignKeysNetwork, _indicesNetwork);
        final TableInfo _existingNetwork = TableInfo.read(_db, "Network");
        if (! _infoNetwork.equals(_existingNetwork)) {
          return new RoomOpenHelper.ValidationResult(false, "Network(com.vrem.wifianalyzer.wifi.database.Network).\n"
                  + " Expected:\n" + _infoNetwork + "\n"
                  + " Found:\n" + _existingNetwork);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7069eab6f71d25dc9de589a6d11e2abc", "eac4c104f2d9ce340b2207a4c09485c9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Network");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Network`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public NetworkDao getNetworkDao() {
    if (_networkDao != null) {
      return _networkDao;
    } else {
      synchronized(this) {
        if(_networkDao == null) {
          _networkDao = new NetworkDao_Impl(this);
        }
        return _networkDao;
      }
    }
  }
}
