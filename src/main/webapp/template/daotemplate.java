#set ($domain = $!domainName.substring(0,1).toLowerCase()+$!domainName.substring(1))package $!{packageName}.dao;

import org.springframework.stereotype.Repository;

@Repository
public class $!{domainName}DAO extends BaseDao{

}