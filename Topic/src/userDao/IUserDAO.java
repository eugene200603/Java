package userDao;

import java.util.ArrayList;

import bean.company;

public interface IUserDAO {

	//C
	boolean createCompany(company com);//V

	//R
	company findUserByNumber(int num);//V

	ArrayList<company> findAllCompany();

	//U
	boolean updateCompany(company com);

	//D
	boolean deleteUserByNumber(int num);

}