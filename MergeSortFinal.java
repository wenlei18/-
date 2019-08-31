package com.ghgj.cn;

import java.util.Arrays;

public class MergeSortFinal {
	public static void main(String[] args) {
		int[] arr={3,1,2,5,7,5,3,8,7,6,4,8,9,34,56,78,23,12,11};
		int[] newarr=new int[arr.length];
		chai(arr,0,arr.length-1,newarr);
		System.out.println(Arrays.toString(arr));
	}
	//���   �ݹ�
	public static void chai(int[] arr,int left,int right,int[] newarr){
		//����
		if(left>=right){
			return;
		}else{
			//�����м�ֵ
			int mid=(left+right)/2;
			//�ݹ����
			//��벿��
			chai(arr, left, mid,newarr);//�߽�
			chai(arr,mid+1,right,newarr);//������ִ����    ������Ĺ������
			//��
			mergeResult(arr, left, right, mid, newarr);
		}
	}
	
	
	//��  merge�ļ��鲢
	public static void mergeResult(int[] arr,int left,int right,int mid,int[] newarr){
		//���壻��������      ��¼���ݼ������ı߽�
		int m=left;
		int n=mid+1;
		//������������   ��¼ÿ�����ݼ����Ҳ�ı߽�
		int x=mid;
		int y=right;
		//����һ������  ��¼��������±��
		int index=0;
		while(m<=x&&n<=y){
			if(arr[m]<arr[n]){
				newarr[index++]=arr[m++];
			}else{
				//arr[left]>=arr[mid+1]
				newarr[index++]=arr[n++];;
			}
		}
		while(m<=x){
			newarr[index++]=arr[m++];
		}
		while(n<=y){
			newarr[index++]=arr[n++];
		}
		for(int i=0;i<index;i++){
			arr[i+left]=newarr[i];
			
		}
		
	}

}
