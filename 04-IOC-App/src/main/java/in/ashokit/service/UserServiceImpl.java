package in.ashokit.service;

import in.ashokit.dao.IUserDao;

public class UserServiceImpl implements IUserService {

	
	private IUserDao userDao;
	
	
	public UserServiceImpl()
	{
		System.out.println("UserServiceImpl :: 0-Constructor");
	}
	
	
	public UserServiceImpl(IUserDao userDao)
	{
		System.out.println("UserServiceImpl :: Constructor");
		this.userDao=userDao;
	}
	
	@Override
	public String getName(int id) {
		
		String Name=userDao.findName(id);
		
		return Name;
	}

}
