$(function(){
		//文件域的id
	     $("#imgFileBTN").uploadify({
	     //前台请求后台的url 不可忽略的参数
	     'uploader' :"../upload/uploadNewsImg.do",
	     //插件自带 不可忽略的参数
	     'swf' : '../js/uploadify/uploadify.swf',
	   //撤销按钮的图片路径""
	     'cancelImg' : '../js/uploadify/uploadify-cancel.png',
	   //如果为true 为自动上传 在文件后 为false 那么它就要我们自己手动点上传按钮
	     'auto' : true,
	     //可以同时选择多个文件 默认为true 不可忽略
	     'multi' : false,
	     //给上传按钮设置文字
	     'buttonText' : '上传图片',
	     //上传后队列是否消失
	     'removeCompleted' : true,
	     'removeTimeout' : 1,
	   //上传文件的个数
	     'uploadLimit' : 2,
	     'fileTypeExts' : '*.jpg;*.jpge;*.gif;*.png',
	     'fileSizeLimit' : '2MB',
	   //给div的进度条加背景 不可忽略
	     'queueID' : 'showBars',
	  // controller层方法中接收文件的参数名, 参数名为自定义
	     'fileObjName' : 'img',
	//      上传成功后的回调函数
	     'onUploadSuccess' : function(file, data, response) {
	    	 alert(data);
	    	  data = data.replace("\"","").replace("\"","");
			 $("#showImg").attr("src","../upload/"+data);
		 	 $("#imgId").val(data);
		  }

	     });
	});