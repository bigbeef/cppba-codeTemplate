#set ($domain = $!domainName.substring(0,1).toLowerCase()+$!domainName.substring(1))
package $!{packageName}.service.impl;

import $!{packageName}.core.bean.PageEntity;
import $!{packageName}.dao.$!{domainName}Dao;
import $!{packageName}.dto.$!{domainName}Dto;
import $!{packageName}.dto.BaseDto;
import $!{packageName}.entity.$!{domainName};
import $!{packageName}.service.$!{domainName}Service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 开发者
 * nickName:大黄蜂
 * email:245655812@qq.com
 * github:https://github.com/bigbeef
 * velocity模板生成 cppba-codeTemplate
 */
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
		$!{domain}Dao.delete($!{domain});
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
	public PageEntity<$!{domainName}> query(BaseDto baseDto) {
		String hql = " select distinct $!{domain} from $!{domainName} $!{domain} where 1=1 ";
		Map params = new HashMap<String,Object>();

		$!{domainName}Dto $!{domain}Dto = ($!{domainName}Dto)baseDto;
		$!{domainName} $!{domain} = $!{domain}Dto.get$!{domainName}();
		int page = $!{domain}Dto.getPage();
		int pageSize = $!{domain}Dto.getPageSize();

		List list = $!{domain}Dao.query(hql,params,page,pageSize);
		long count = $!{domain}Dao.count(hql,params);
		PageEntity<$!{domainName}> pe = new PageEntity<$!{domainName}>();
		pe.setCount(count);
		pe.setList(list);
		return pe;
	}
}

