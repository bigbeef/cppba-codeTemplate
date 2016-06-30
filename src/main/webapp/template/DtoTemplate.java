#set ($domain = $!domainName.substring(0,1).toLowerCase()+$!domainName.substring(1))package $!{packageName}.dao;

package $!{packageName}.dto;

import $!{packageName}.entity.$!{domainName};

public class $!{domainName}Dto extends BaseDto{
    private $!{domainName} $!{domain};

    public $!{domainName} get$!{domainName}() {
        return $!{domain};
    }

    public void set$!{domainName}($!{domainName} $!{domain}) {
        this.$!{domain} = $!{domain};
    }
}