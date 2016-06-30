#set ($domain = $!domainName.substring(0,1).toLowerCase()+$!domainName.substring(1))package $!{packageName}.service;

import $!{packageName}.bean.pagination.PageEntity;
import $!{packageName}.dto.BaseDto;
import $!{packageName}.entity.${domainName};

public interface $!{domainName}Service {
	void save($!{domainName} $!{domain});

	void delete($!{domainName} $!{domain});

	void update($!{domainName} $!{domain});

	$!{domainName} findById(int id);

	PageEntity<$!{domainName}> query(BaseDto baseDto);
}
