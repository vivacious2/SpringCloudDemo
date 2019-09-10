package com.imooc.homepage.service;

import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;

import java.util.List;

public interface ICourseService {
    /**
     * <h2>通过 id 获取课程信息</h2>
     * */
    CourseInfo getCourseInfo(Long id);

    /**
     * <h2>通过 ids 获取课程信息</h2>
     * */
    List<CourseInfo> getCourseInfos(CourseInfosRequest request);
}
