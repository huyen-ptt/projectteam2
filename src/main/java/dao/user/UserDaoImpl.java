package dao.user;

import java.sql.Connection;
import java.util.List;

import model.UserModel;

public class UserDaoImpl implements IUserDao {
	
    private Connection connection;
	
    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

	

	@Override
	public void insertUser() {
		// TODO Auto-generated method stub
		//todo để đánh dấu việc cần thực hiện
		
	}

	@Override
	public UserModel getUserbyEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loginUser(String Username, String Password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserModel> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(int id, UserModel user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

}
