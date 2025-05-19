package projects;

import java.sql.Connection;

import projects.dao.DbConnections;

public class ProjectsApp {

	public static void main(String[] args) {
		Connection conn = DbConnections.getConnection();

	}

}