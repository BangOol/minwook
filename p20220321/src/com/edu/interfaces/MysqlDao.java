package com.edu.interfaces;

public class MysqlDao implements Dao {

	public void select() {
		System.out.println("MySQLDB에서 조회합니다.");
	}

	public void insert() {
		System.out.println("MySQLDB에서 입력합니다.");
	}

	public void update() {
		System.out.println("MySQLDB에서 수정합니다.");
	}

	public void delete() {
		System.out.println("MySQLDB에서 삭제합니다.");
	}
	
}
