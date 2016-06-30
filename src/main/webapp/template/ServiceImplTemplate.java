#set ($domain = $!domainName.substring(0,1).toLowerCase()+$!domainName.substring(1))
package $!{packageName}.service.impl;

import $!{packageName}.dao.$!{domainName}Dao;
import $!{packageName}.dto.$!{domainName}Dto;
import $!{packageName}.entity.$!{domainName};
import $!{packageName}.service.$!{domainName}Service;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@Transactional
public class $!{domainName}ServiceImpl implements $!{domainName}Service{
	@Resource
	private $!{domainName}Dao $!{domain}Dao;

	@Override
	public void save($!{domainName} $!{domain}) {
		$!{domain}Dao.save($!{domain});
	}

	@Override
	public void delete($!{domainName} $!{domain}) {
		$!{domainName}Dao.delete($!{domain});
	}

	@Override
	public void update($!{domainName} $!{domain}) {
		$!{domain}Dao.update($!{domain});
	}

	@Override
	public $!{domainName} findById(int id) {
		return ($!{domainName}) $!{domain}Dao.get($!{domainName}.class, id);
	}

	@Override
	public List<$!{domainName}> query(BaseDto baseDto) {
		String hql = " select distinct $!{domain} from $!{domainName} $!{domain} where 1=1 ";
		Map params = new HashMap<String,Object>();

		$!{domainName}Dto $!{domain}Dto = ($!{domainName}Dto)baseDto;
		$!{domainName} $!{domain} = $!{domain}Dto.get$!{domainName}();
		Integer page = $!{domain}Dto.getPage();
		Integer pageSize = $!{domain}Dto.getPageSize();

		return $!{domain}Dao.query(hql,params,0,0);
	}
}

