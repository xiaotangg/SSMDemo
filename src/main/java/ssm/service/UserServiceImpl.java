package ssm.service;

import org.springframework.stereotype.Service;
import ssm.dao.mapper.UserTMapper;
import ssm.dao.pojo.UserT;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements  UserService {

    @Resource
    private UserTMapper userTMapper;

    @Override
    public UserT getUserById(int id) {
       return  userTMapper.selectByPrimaryKey(id);
    }
}
