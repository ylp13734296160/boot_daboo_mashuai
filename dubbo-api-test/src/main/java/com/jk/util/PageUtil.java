package com.jk.util;

import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 *
 * @param <T>
 */
public class PageUtil<T> {
	
	//存储列表数据
	private List<T> list;
	
	//搜索扩展
	private T t;
	
	//当前页
	private Integer pageIndex;
	
	//每页条数
	private Integer pageSize;
	
	//总页数
	private Integer pageTotal;
	
	//总记录数
	private Integer dataTotal;
	
	//开始
	private boolean isFirstPage=false;        //是否为第一页
    private boolean isLastPage=false;         //是否为最后一页
    private boolean hasPreviousPage=false;   //是否有前一页
    private boolean hasNextPage=false;       //是否有下一页
     
    private int navigatePages=5; //导航页码数
    private int[] navigatePageNumbers;  //所有导航页号
    //结束
	
	//自定义有参构造方法，传入页数和条数
	public PageUtil(Integer dataTotal, Integer pageIndex, Integer pageSize) {
		super();
		
		this.pageIndex = pageIndex == null ? 1 : pageIndex ;
		this.pageSize = pageSize == null ? 2 : pageSize ;
		this.dataTotal = dataTotal < 0 ? 1 : dataTotal ;
		//计算总页数
		this.pageTotal = (this.dataTotal-1) / this.pageSize + 1;
		
		//纠正有可能出现错误的参数
		if(this.pageIndex > this.pageTotal){
			this.pageIndex = this.pageTotal;
		}
		
		if(this.pageIndex < 1 ){
			this.pageIndex = 1;
		}
		
		//基本参数设定之后进行导航页面的计算
        calcNavigatePageNumbers();
      //以及页面边界的判定
        judgePageBoudary();
		
	}
	
	 /**
	  * 开始
     * 计算导航页
     */
    private void calcNavigatePageNumbers(){
        //当总页数小于或等于导航页码数时
        if(pageTotal <= navigatePages){
            navigatePageNumbers = new int[pageTotal];
            for(int i=0; i<pageTotal; i++){
                navigatePageNumbers[i]=i+1;
            }
        }else{ //当总页数大于导航页码数时
            navigatePageNumbers = new int[navigatePages];
            int startNum = pageIndex - navigatePages / 2;
            int endNum = pageIndex + navigatePages / 2;
             
            if(startNum<1){
                startNum=1;
                //(最前navPageCount页
                for(int i=0; i<navigatePages; i++){
                    navigatePageNumbers[i] = startNum++;
                }
            }else if(endNum > pageTotal){
                endNum = pageTotal;
                //最后navPageCount页
                for(int i=navigatePages-1; i>=0; i--){
                    navigatePageNumbers[i] = endNum--;
                }
            }else{
                //所有中间页
                for(int i=0; i<navigatePages; i++){
                    navigatePageNumbers[i] = startNum++;
                }
            }
        }
    }
    
    /**
     * 判定页面边界
     */
    private void judgePageBoudary(){
        isFirstPage = pageIndex == 1;
        isLastPage = pageIndex == pageTotal && pageIndex != 1;
        hasPreviousPage = pageIndex != 1;
        hasNextPage = pageIndex != pageTotal;
    }
    //结束
	
	//分页方法：设置起始条数
	public Integer getStartIndex(){
		Integer firstResultCount = ( getPageIndex() - 1 ) * getPageSize();
		return firstResultCount;
	}
	//分页方法：结束位子
	public Integer getEndIndex(){
		Integer endResultCount = getStartIndex() + getPageSize();
		return endResultCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}

	public Integer getDataTotal() {
		return dataTotal;
	}

	public void setDataTotal(Integer dataTotal) {
		this.dataTotal = dataTotal;
	}
	
	
	/**
     * 得到所有导航页号   开始
     * @return {int[]}
     */
    public int[] getNavigatePageNumbers() {
        return navigatePageNumbers;
    }
 
    public boolean isFirstPage() {
        return isFirstPage;
    }
    public boolean getIsFirstPage() {
    	return isFirstPage;
    }
 
    public boolean isLastPage() {
        return isLastPage;
    }
    public boolean getIsLastPage() {
    	return isLastPage;
    }
 
    public boolean hasPreviousPage() {
        return hasPreviousPage;
    }
    public boolean getHasPreviousPage() {
    	return hasPreviousPage;
    }
 
    public boolean hasNextPage() {
        return hasNextPage;
    }
    public boolean getHasNextPage() {
    	return hasNextPage;
    }

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "PageUtil [list=" + list + ", t=" + t + ", pageIndex=" + pageIndex + ", pageSize=" + pageSize
				+ ", pageTotal=" + pageTotal + ", dataTotal=" + dataTotal + ", isFirstPage=" + isFirstPage
				+ ", isLastPage=" + isLastPage + ", hasPreviousPage=" + hasPreviousPage + ", hasNextPage=" + hasNextPage
				+ ", navigatePages=" + navigatePages + ", navigatePageNumbers=" + Arrays.toString(navigatePageNumbers)
				+ "]";
	}
    
	//结束

	
}
