package com.edu.interfaces;

public class DaoExe {
	public static void main(String[] args) {

		Dao dao;

		
		dao = new MysqlDao();
		dao.select();

		dao.insert();

		dao.update();

		dao.delete();
	}
}
