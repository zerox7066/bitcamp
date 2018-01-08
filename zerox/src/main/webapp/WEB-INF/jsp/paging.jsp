<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="prevPageDisabled" value="${(pageNo > 1) ? '':'disabled'}"/>
<c:set var="prevPageTabIndex" value="${(pageNo > 1) ? 0: -1}"/>
<c:set var="nextPageDisabled" value="${(pageNo < lastPageNo) ? '':'disabled'}"/>
<c:set var="nextPageTabIndex" value="${(pageNo < lastPageNo) ? 0: -1}"/>

<nav aria-label="Page navigation" style="borad:1px solid red">
  <ul class="pagination justify-content-center">
    <li class="page-item ${prevPageDisabled}"><a class="page-link" 
        href="list?pn=${pageNo - 1}"
        tabindex="${prevPageTabIndex}">이전</a></li>
    <li class="page-item"><a class="page-link" href="#">${pageNo}</a></li>
    <%-- 
    <li class="page-item"><a class="page-link" href="#">${pageNo + 1}</a></li>
    
    <li class="page-item active">
      <span class="page-link"> ${pageNo + 1}
        <span class="sr-only">(current)</span>
      </span>
    </li>
    
    <li class="page-item"><a class="page-link" href="#">${pageNo + 2}</a></li>
     --%>
    <li class="page-item ${nextPageDisabled}"><a class="page-link" 
        href="list?pn=${pageNo + 1}"
        tabindex="${nextPageTabIndex}">다음</a></li>
  </ul>
</nav>
