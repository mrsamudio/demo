package tech.samudio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class DemoDataSourceService {
    private final DataSource dataSource;

    @Autowired
    public DemoDataSourceService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
