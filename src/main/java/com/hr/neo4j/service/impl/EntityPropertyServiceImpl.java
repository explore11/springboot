package com.hr.neo4j.service.impl;

import com.hr.neo4j.mapper.EntityPropertyMapper;
import com.hr.neo4j.service.IEntityPropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @since 2022-07-03
 */
@Service
public class EntityPropertyServiceImpl implements IEntityPropertyService {

    @Resource
    private EntityPropertyMapper entityPropertyMapper;


}