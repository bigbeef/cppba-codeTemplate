#set ($domain = $!domainName.substring(0,1).toLowerCase()+$!domainName.substring(1))
package $!{packageName}.dao;

import $!{packageName}.entity.$!{domainName};

/**
 * 开发者
 * nickName:大黄蜂
 * email:245655812@qq.com
 * github:https://github.com/bigbeef
 * velocity模板生成 cppba-codeTemplate
 */
public class $!{domainName}Dto extends BaseDto{
    private $!{domainName} $!{domain};

    public $!{domainName} get$!{domainName}() {
        return $!{domain};
    }

    public void set$!{domainName}($!{domainName} $!{domain}) {
        this.$!{domain} = $!{domain};
    }
}