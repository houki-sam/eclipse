<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm navbar-dark mb-3" >
	<div class="container">
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav4" aria-controls="navbarNav4" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand font-weight-bold" href="/chocobanana" style="color:#00336D">はるみ通信販売</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto">
            	<% if(request.isUserInRole("recept")){%>
	                <li class="nav-item">
	                    <a class="nav-link" href="/chocobanana/recept/menu" style="color: #00336D">注文受付</a>
	                </li>
				<%} if(request.isUserInRole("order")){%>
	                <li class="nav-item">
	                    <a class="nav-link" href="/chocobanana/order/menu" style="color: #00336D">発注</a>
	                </li>
	            <%} if(request.isUserInRole("money")){%>
	                <li class="nav-item">
	                    <a class="nav-link" href="/chocobanana/money/menu" style="color: #00336D">請求入金</a>
	                </li>
				<%} %>
            </ul>
            <ul class="navbar-nav">
            	<%@ page import ="javax.servlet.http.HttpSession" %>
            	<%	HttpSession session1 = request.getSession(false);
            		if((String)request.getRemoteUser() != null) {%>
            		<li class="nav-item" >
            			<a class="nav-link" style="color: #00336D">こんにちは<%=(String)request.getRemoteUser() %></a>
            		</li>
                	<li class="nav-item">
                		<a href="/chocobanana/logout">
                    		<button class="btn" style="background-color:#00336D;color: #fff;">ログアウト</button>
                    	</a>
                	</li>
                <%} else{%>
                	<li class="nav-item">
                	<a href="/chocobanana/login/login">
                    	<button class="btn" style="background-color:#00336D;color: #fff;">ログイン</button>
                   	</a>
                	</li>
                <%} %>
            </ul>
        </div>
	</div>
</nav>
