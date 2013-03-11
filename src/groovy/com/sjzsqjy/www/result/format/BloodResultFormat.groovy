package com.sjzsqjy.www.result.format

class BloodResultFormat {
	///女的血流变量正常值
	static normalList=[[7.67,10.29],[4.54,5.77],[3.74,4.61],[1.20,1.73],[36.66,44.12],[0.00,20.00],
	[13.04,25.72],[6.59,13.04],[4.78,5.79],[0.00,120],[1.55,2.73],[3.51,5.87]
	,[0.55,0.96],[4.15,6.49],[4.00,7.90],[3.07,5.83],[2.38,4.71]]
	//男的血流正常值得
	static normalList1=[[7.00,9.50],[5.32,6.99],[4.33,5.64],[1.20,1.73],[42.52,48.44],[0.00,15.00],
	[13.41,22.53],[7.43,12.67],[4.93,8.36],[0.00,93],[1.75,2.99],[3.51,5.81]
	,[0.46,0.78],[4.59,6.17],[4.00,7.90],[3.07,5.83],[2.38,4.71]]
	static itemList=[["全血粘度：低切(mPa.s)|20(1/s)"],
	["全血粘度：中切(mPa.s)|20(1/s)"],
	["全血粘度：高切(mPa.s)|20(1/s)"]
	,["血浆粘度"],["红细胞压积(%)"],["血沉(MM/H)"],["全血还原粘度(低切)"],
	["全血还原粘度(中切)"],["全血还原粘度(高切)"],
	["血沉方程K值"],["红细胞聚集指数"],["红细胞刚性指数"],["红细胞变性指数"]
	,["红细胞电泳指数"],["全血相对粘度(低切)"],["全血相对粘度(中切)"],["全血相对粘度(高切)"]]
	static String name
	static String sendDate
	static String testDate
	static String doorNum
	static String patientNum
	static String sex
	static String sendDoctor
	static String testDoctor
	static String hospitalNum
	static String bedNum
	static String age
	static String keBie
	static String sampleId
	static String type
	String item
	float value
	String result
	////为1时为男，为2时为女
	void isNormal(int i,int sex){
		if(sex==2){
			if(normalList[i][0]>value){
				result="L"
			}
			if(normalList[i][1]<value){
				result="H"
			}
		}
		else{
			if(normalList1[i][0]>value){
				result="L"
			}
			if(normalList1[i][1]<value){
				result="H"
			}
		}
	}
	
	static void main(args){
		println BloodResultFormat.normalList[0][0]
	}
}
