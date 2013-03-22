<#macro printType typeRoot>
  <#list typeRoot.* as type><#if type?node_name=="simpleType">${type}<#elseif type?node_name=="ellipseType"><@printType typeRoot=type />...<#elseif type?node_name=="arrayType"><@printType typeRoot=type />[]</#if></#list></#macro>

<#assign javaSource = doc.javaSource>
<#if javaSource.package??>package ${javaSource.package};

</#if><#if javaSource.imports??><#list javaSource.imports.import as import>import ${import};
</#list>
</#if>
<#assign class = javaSource.class>

<#if class.@accessor != "default">${class.@accessor} </#if>class ${class.@name}
{
  <@printType typeRoot = class.type/>;
  <#assign attributeList = class.attributes>
  <#list attributeList.attribute as attrib>	<#if attrib.@accessor != "default">${attrib.@accessor} </#if>${attrib.@type} ${attrib.@name};
  </#list>
  
  <#assign constructors = class.constructors>
  <#list constructors.constructor as construct>	${construct.@accessor} ${class.@name}(<#list construct.parameters.parameter as param>${param.@type} ${param.@name}<#if param_has_next>, </#if></#list>)
	{
		<#assign statements = construct.statements>
<#list statements.* as statement>		<#if statement?node_name == "assignment">${statement.@lhs} = ${statement.@rhs}</#if>
		</#list>
	}
  </#list>
}