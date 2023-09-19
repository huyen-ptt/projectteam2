package dao.user;

import java.util.List;

import model.UserModel;

public interface IUserDao {
   void insertUser(); //thêm 1 user
   UserModel getUserbyEmail(String email);
   boolean loginUser(String Username ,String Password ); //check đúng sai khi đăng nhập
   List<UserModel> getAllUser();
   void updateUser(int id , UserModel user);
   void deleteUser(int id);
}
