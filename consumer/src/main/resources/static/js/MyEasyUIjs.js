
















function OpenTab(Text,URL){
	if( $("#MenusTabs").tabs('exists', Text) ){
		$("#MenusTabs").tabs('select', Text);
	}
	else{
		var Content = "<iframe frameborder='0' scrolling='auto' style='width:100%;height:100%' src=" + URL + "></iframe>";
		$("#MenusTabs").tabs('add',{
			title:Text,
			closable:true,
			content:Content
		});	
	}
}
 
(function(){
	var TreeMenusDatas=[{
		text:"图书馆图书系统",
		children:[{
			text:"小说图书信息",
			attributes:{
				url:"data.jsp"
			}
		}]
	}];
	
	$("#TreeMenus").tree({
		data:TreeMenusDatas,
		lines:true,
		onClick:function(node){
			if( node.attributes ){
				OpenTab( node.text, node.attributes.url );
			}
		}
	});
})();