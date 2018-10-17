<%@ tag body-content="scriptless"  dynamic-attributes="dynattrs" %> 

<jsp:doBody var="theBody" scope="request"/>

${ theBody.toUpperCase( })