package com.miterfish.fishbowl.test;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.util.Map;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import freemarker.template.Template;

import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateException;

public class TemplateTest
{
	public static void mainTest(String[] args)
	{
		Configuration configuration = new Configuration();
		try
		{
			configuration.setDirectoryForTemplateLoading(new File("C:\\Users\\Justin\\workspace\\pBuilder\\src\\main\\resources\\templates"));
			configuration.setObjectWrapper(new DefaultObjectWrapper());
			
			Template template = configuration.getTemplate("java_template.ftl");
			
			Map<Object,Object> root = new HashMap<Object,Object>();			
			root.put("doc", NodeModel.parse(new File("C:\\Users\\Justin\\workspace\\pBuilder\\src\\main\\resources\\templates\\xml\\java_layout.xml")));
			
			Writer writer = new OutputStreamWriter(System.out);
			
			template.process(root, writer);
			writer.flush();
		}
		catch (IOException e)
		{
			System.console().printf(e.toString());
			return;
		}
		catch (SAXException e)
		{
			System.console().printf(e.toString());
			return;
		}
		catch (ParserConfigurationException e)
		{
			System.console().printf(e.toString());
			return;
		}
		catch (TemplateException e)
		{
			System.console().printf(e.toString());
			return;
		}
	}

}
