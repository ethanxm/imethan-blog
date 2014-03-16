package com.the3.repository.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.the3.entity.user.Permission;
import com.the3.entity.user.Role;
import com.the3.entity.user.User;

/**
 * UserRepositoryTest.java
 *
 * @author Ethan Wong
 * @time 2014年3月16日下午5:31:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/main/applicationContext.xml"})
public class RoleRepositoryTest {
	
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private PermissionRepository permissionRepository;
	
	@Test
	public void testSave(){
		Role role = new Role();
		role.setRolename("栏目管理员");
		List<Permission> allPermission = permissionRepository.findAll();
		role.setPermissions(allPermission);
		roleRepository.save(role);
	}
	
	
	

}


