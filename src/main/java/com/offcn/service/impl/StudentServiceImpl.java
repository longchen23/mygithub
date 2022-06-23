package com.offcn.service.impl;

import com.offcn.pojo.Student;
import com.offcn.mapper.StudentMapper;
import com.offcn.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author longchen
 * @since 2022-06-22
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}