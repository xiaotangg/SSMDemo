package ssm.service;

import ssm.dao.pojo.UserT;

public interface UserService {
    UserT getUserById(int id);
}
