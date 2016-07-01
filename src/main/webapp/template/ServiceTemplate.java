#set ($domain = $!domainName.substring(0,1).toLowerCase()+$!domainName.substring(1))
package $!{packageName}.service;

import $!{packageName}.core.bean.PageEntity;
import $!{packageName}.dto.BaseDto;
import $!{packageName}.entity.${domainName};

/**
 * 开发者
 * nickName:大黄蜂
 * email:245655812@qq.com
 * github:https://github.com/bigbeef
 * velocity模板生成 cppba-codeTemplate
 */
public interface $!{domainName}Service {
	void save($!{domainName} $!{domain});

	void delete($!{domainName} $!{domain});

	void update($!{domainName} $!{domain});

	$!{domainName} findById(int id);

	PageEntity<$!{domainName}> query(BaseDto baseDto);
}
