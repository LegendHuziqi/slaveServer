package edu.tute.center_server.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NodeMapper {

    //注册新账号
    Integer createAccount(@Param("corporateName") String corporateName, @Param("industry") String industry, @Param("region") String region, @Param("contactName") String contactName, @Param("mailbox") String mailbox, @Param("phoneNumber") String phoneNumber, @Param("accountNumber") String accountNumber, @Param("password") String password);
}
