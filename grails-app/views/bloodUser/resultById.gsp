<!--血流结果显示-->
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
    <link rel="shortcut icon"
          href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
    <title>普利生仪器中心血流变仪测试报告--${patient.name}</title>
</head>
<body id="center">

<div id="bodyLeft"><br/>
    <span class="i8">普利生仪器中心血流变仪测试报告</span>
    <br/>
    <table width="650" style="border-collapse: collapse; border: solid #000000; border-width: 1px 0 1px 0px;">
        <tbody>
        <tr class="prop">
            <td valign="top" class="name">
                ${patient?.name}
            </td>
            <td valign="top" class="name">
                ${patient?.sendDate}
            </td>
            <td valign="top" class="name">
                ${patient?.testDate}
            </td>
            <td valign="top" class="name">
                ${patient.checkNum}
            </td>

            <td valign="top" class="name">
                ${patient?.patientNum}
            </td>
        </tr>
        <tr class="prop">
            <td valign="top" class="name">
                ${patient?.sex}
            </td>
            <td valign="top" class="name">
                ${patient?.sendDoctor}
            </td>

            <td valign="top" class="name">
                ${patient?.testDoctor}
            </td>
            <td valign="top" class="name">
                ${patient?.hospitalNum}
            </td>
            <td valign="top" class="name">
                ${patient?.bedNum}
            </td>
        </tr>
        <tr class="prop">
            <td valign="top" class="name">
                ${patient?.age}
            </td>
            <td valign="top" class="name">
                ${patient?.keBie}
            </td>
            <td valign="top" class="name">
                ${patient?.sampleId}
            </td>
            <td valign="top" class="name">
                ${patient?.type}
            </td>


        </tr>


        </tbody>
    </table>
    <table width="650" style="border-collapse: collapse; border: solid #000000; border-width: 0px 0 1px 0px;">

        <tr>

            <td width="300px;">项目</td>

            <td>检测值</td>

            <td>结果</td>

            <td>参考值</td>



        </tr>

        <g:each in="${resultList}" status="i" var="resultInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td style="width:300px;font-size:14px;height:21px;">
                    ${resultInstance[0]}
                </td>

                <td style="font-size:12px;">
                    ${resultInstance[1]}
                </td>

                <td style="font-size:14px;">
                   <g:if test="${resultInstance[1]<resultInstance[2]}">
                       L
                       </g:if>
                    <g:if test="${resultInstance[1]>resultInstance[3]}">
                       H
                    </g:if>
                </td>
                <td style="font-size:12px;">
                       ${resultInstance[2]}---${resultInstance[3]}
                </td>
            </tr>
        </g:each>

    </table>
    <img
            src="${createLinkTo(dir: 'images', file:'blood.jpg')}" />
    <div style="text-align:left;font-size:14px;">
        <p>临床诊断意义：</p>
        <p>1、血粘度增高：会出现脑中风、心肌梗塞、冠心病、血栓闭塞性脉管炎、动脉硬化性栓塞、外周缼血性病（糖尿病人</p>
        <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;粘度高易产生并发病，肿瘤人易发转移）</p>
        <p>2、血粘度降低：会出现血性脑中风、上消化道出血、鼻出血、子宫出血、出血性休克等其他疾病</p>
        <p>3、血沉方程K值：判断细胞聚集能力</p>
        <p>4、压积增高：影响血液粘度增高的原因之一</p>
        <p>5、血沉：反映红细胞在血浆中的分散能力或聚集状态</p>
        <p>6、全血高切：红细胞变形能力</p>
        <p>7、全血低切：红细胞聚集能力</p>
    </div>
</div>
</body>
</html>
