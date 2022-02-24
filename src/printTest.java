import java.awt.Color;

import com.spire.doc.*;
import com.spire.doc.documents.BorderStyle;
import com.spire.doc.documents.HorizontalAlignment;
import com.spire.doc.documents.PageOrientation;
import com.spire.doc.documents.PageSize;
import com.spire.doc.documents.Paragraph;
import com.spire.doc.documents.ParagraphStyle;
import com.spire.doc.documents.TextWrappingStyle;
import com.spire.doc.documents.UnderlineStyle;
import com.spire.doc.documents.VerticalOrigin;
import com.spire.doc.fields.DocPicture;
import com.spire.doc.fields.TextRange;

public class printTest {
	public static void main(String[] args) {
		// 创建Word文档
		Document document = new Document();
		// 添加一个section
		Section section = document.addSection();

		section.getPageSetup().setOrientation(PageOrientation.Landscape);
		// 设置纸张大小
		section.getPageSetup().setPageSize(PageSize.A3);

		// 添加三栏到section，并设置每栏的宽度和间距
		section.addColumn(100, 30);
		section.addColumn(100, 30);

		// 加载图片添加到页眉，并设置图片在段落中的对齐方式
		HeaderFooter header = section.getHeadersFooters().getHeader();
		Paragraph hpara = header.addParagraph();
		DocPicture pic = hpara.appendPicture("/Users/shuzhuo/Downloads/1.png");
		pic.setHorizontalAlignment(ShapeHorizontalAlignment.Left);
		pic.setVerticalOrigin(VerticalOrigin.Top_Margin_Area);
		pic.setVerticalAlignment(ShapeVerticalAlignment.Center);
		pic.setWidth(100);
		pic.setHeight(50);
		// 添加文字到页眉，并设置字体、字号、字体加粗、对齐方式
		TextRange txt = hpara.appendText(
				"国家能源集团华北电力有限公司廊坊热电厂\nCHN ENERGY NORTH CHINA ELLECTRIC POWER CO.,LTD.,LANGFANG THERMAL POWER PLANT\n河北省廊坊市广阳区枣林路66号\nNo.66 Zaolin Road, Guanyang District, Langfang City, Hebei Province");
		txt.getCharacterFormat().setUnderlineStyle(UnderlineStyle.None);
		txt.getCharacterFormat().setTextColor(Color.GRAY);
		txt.getCharacterFormat().setFontName("宋体");
		txt.getCharacterFormat().setFontSize((float) 7.5);
		txt.getCharacterFormat().setBold(true);
		hpara.getFormat().setHorizontalAlignment(HorizontalAlignment.Right);
		pic.setTextWrappingStyle(TextWrappingStyle.Behind);
        hpara.getFormat().getBorders().getBottom().setBorderType(BorderStyle.Single);
        hpara.getFormat().getBorders().getBottom().setLineWidth(0.5f);
        hpara.getFormat().getBorders().setSpace(2f);

		String title = "国家能源集团华北电力有限公司廊坊热电厂\n" + "2020年项目部新增人员工作票“三种人”考试\n\n";
		Paragraph paragraph = section.addParagraph();
		// 添加文本到段落
		paragraph.getFormat().setHorizontalAlignment(HorizontalAlignment.Center);
		paragraph.appendText(title);

		for (int i = 0; i < 100; i++) {
			String text = String.valueOf(i) + ":   1加1等于几";
			// 添加文本到段落
			paragraph = section.addParagraph();
			paragraph.appendText(text);
			paragraph.appendText("\n");
			paragraph.appendText("aaa");
			paragraph.appendText("\n");
			paragraph.appendText("bbb");
			paragraph.appendText("\n");
			// 添加分栏符 （分栏符后面的文字将从下一栏开始）
		}

		// 创建段落样式，并设置字体和字号
		ParagraphStyle paragraphStyle = new ParagraphStyle(document);
		paragraphStyle.setName("style1");
		paragraphStyle.getCharacterFormat().setFontName("宋体");
		paragraphStyle.getCharacterFormat().setFontSize(15);
		paragraphStyle.getCharacterFormat().setBold(true);
		document.getStyles().add(paragraphStyle);

		section.getParagraphs().get(0).applyStyle("style1");

		// 创建段落样式，并设置字体和字号
		paragraphStyle = new ParagraphStyle(document);
		paragraphStyle.setName("style2");
		paragraphStyle.getCharacterFormat().setFontName("宋体");
		paragraphStyle.getCharacterFormat().setFontSize((float) 10.5);
		document.getStyles().add(paragraphStyle);

		// 给段落应用段落样式
		for (int i = 1; i < section.getParagraphs().getCount(); i++) {
			section.getParagraphs().get(i).applyStyle("style2");
		}

		// 保存结果文档
		document.saveToFile("/Users/shuzhuo/Downloads/helloWorld.docx", FileFormat.Docx);

	}

}
