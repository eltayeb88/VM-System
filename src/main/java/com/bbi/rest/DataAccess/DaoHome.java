package com.bbi.rest.dataaccess;

import java.util.List
import com.bbi.rest.dataaccess.DaoObject;

public interface DaoHome {

  public List<DaoObject> listAll();
  public DaoObject getById(DaoObject obj);
  public boolean insert(DaoObject obj);
  public boolean update(DaoObject obj);
  public boolean delete(DaoObject obj);

}