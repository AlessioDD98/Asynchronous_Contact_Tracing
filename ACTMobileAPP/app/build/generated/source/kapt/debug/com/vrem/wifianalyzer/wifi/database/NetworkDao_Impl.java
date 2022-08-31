package com.vrem.wifianalyzer.wifi.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NetworkDao_Impl implements NetworkDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Network> __insertionAdapterOfNetwork;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<Network> __updateAdapterOfNetwork;

  public NetworkDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNetwork = new EntityInsertionAdapter<Network>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Network` (`SSID`,`BSSID`,`TimeFound`,`TimeLost`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Network value) {
        if (value.getSSID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSSID());
        }
        if (value.getBSSID() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBSSID());
        }
        final Long _tmp;
        _tmp = __dateConverter.fromDate(value.getTimeFound());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = __dateConverter.fromDate(value.getTimeLost());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
      }
    };
    this.__updateAdapterOfNetwork = new EntityDeletionOrUpdateAdapter<Network>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Network` SET `SSID` = ?,`BSSID` = ?,`TimeFound` = ?,`TimeLost` = ? WHERE `BSSID` = ? AND `TimeFound` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Network value) {
        if (value.getSSID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSSID());
        }
        if (value.getBSSID() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBSSID());
        }
        final Long _tmp;
        _tmp = __dateConverter.fromDate(value.getTimeFound());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = __dateConverter.fromDate(value.getTimeLost());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
        if (value.getBSSID() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBSSID());
        }
        final Long _tmp_2;
        _tmp_2 = __dateConverter.fromDate(value.getTimeFound());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp_2);
        }
      }
    };
  }

  @Override
  public void insertNetwork(final Network network) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNetwork.insert(network);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateNetwork(final Network network) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNetwork.handle(network);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Network> getNetworks() {
    final String _sql = "SELECT * FROM Network";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "SSID");
      final int _cursorIndexOfBSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "BSSID");
      final int _cursorIndexOfTimeFound = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeFound");
      final int _cursorIndexOfTimeLost = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeLost");
      final List<Network> _result = new ArrayList<Network>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Network _item;
        final String _tmpSSID;
        _tmpSSID = _cursor.getString(_cursorIndexOfSSID);
        final String _tmpBSSID;
        _tmpBSSID = _cursor.getString(_cursorIndexOfBSSID);
        final Date _tmpTimeFound;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimeFound)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimeFound);
        }
        _tmpTimeFound = __dateConverter.toDate(_tmp);
        final Date _tmpTimeLost;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfTimeLost)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfTimeLost);
        }
        _tmpTimeLost = __dateConverter.toDate(_tmp_1);
        _item = new Network(_tmpSSID,_tmpBSSID,_tmpTimeFound,_tmpTimeLost);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Network> getFilteredNetworks(final String sBSSID) {
    final String _sql = "SELECT * FROM Network WHERE BSSID LIKE? AND TimeLost IS null";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sBSSID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sBSSID);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "SSID");
      final int _cursorIndexOfBSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "BSSID");
      final int _cursorIndexOfTimeFound = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeFound");
      final int _cursorIndexOfTimeLost = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeLost");
      final List<Network> _result = new ArrayList<Network>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Network _item;
        final String _tmpSSID;
        _tmpSSID = _cursor.getString(_cursorIndexOfSSID);
        final String _tmpBSSID;
        _tmpBSSID = _cursor.getString(_cursorIndexOfBSSID);
        final Date _tmpTimeFound;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimeFound)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimeFound);
        }
        _tmpTimeFound = __dateConverter.toDate(_tmp);
        final Date _tmpTimeLost;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfTimeLost)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfTimeLost);
        }
        _tmpTimeLost = __dateConverter.toDate(_tmp_1);
        _item = new Network(_tmpSSID,_tmpBSSID,_tmpTimeFound,_tmpTimeLost);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Network> getFilteredNetworksByBSSID(final String sBSSID) {
    final String _sql = "SELECT * FROM Network WHERE BSSID LIKE? AND TimeFound IS NOT null AND TimeLost IS NOT null";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sBSSID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sBSSID);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "SSID");
      final int _cursorIndexOfBSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "BSSID");
      final int _cursorIndexOfTimeFound = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeFound");
      final int _cursorIndexOfTimeLost = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeLost");
      final List<Network> _result = new ArrayList<Network>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Network _item;
        final String _tmpSSID;
        _tmpSSID = _cursor.getString(_cursorIndexOfSSID);
        final String _tmpBSSID;
        _tmpBSSID = _cursor.getString(_cursorIndexOfBSSID);
        final Date _tmpTimeFound;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimeFound)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimeFound);
        }
        _tmpTimeFound = __dateConverter.toDate(_tmp);
        final Date _tmpTimeLost;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfTimeLost)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfTimeLost);
        }
        _tmpTimeLost = __dateConverter.toDate(_tmp_1);
        _item = new Network(_tmpSSID,_tmpBSSID,_tmpTimeFound,_tmpTimeLost);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Network> getOpenNetworks() {
    final String _sql = "SELECT * FROM Network WHERE TimeLost IS null";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "SSID");
      final int _cursorIndexOfBSSID = CursorUtil.getColumnIndexOrThrow(_cursor, "BSSID");
      final int _cursorIndexOfTimeFound = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeFound");
      final int _cursorIndexOfTimeLost = CursorUtil.getColumnIndexOrThrow(_cursor, "TimeLost");
      final List<Network> _result = new ArrayList<Network>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Network _item;
        final String _tmpSSID;
        _tmpSSID = _cursor.getString(_cursorIndexOfSSID);
        final String _tmpBSSID;
        _tmpBSSID = _cursor.getString(_cursorIndexOfBSSID);
        final Date _tmpTimeFound;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimeFound)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimeFound);
        }
        _tmpTimeFound = __dateConverter.toDate(_tmp);
        final Date _tmpTimeLost;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfTimeLost)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfTimeLost);
        }
        _tmpTimeLost = __dateConverter.toDate(_tmp_1);
        _item = new Network(_tmpSSID,_tmpBSSID,_tmpTimeFound,_tmpTimeLost);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
