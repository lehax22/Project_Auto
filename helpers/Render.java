package helpers;

import coonhelp.ConfigSingleton;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Alex on 18.11.2016.
 */
public class Render {

    public void render(HttpServletRequest request, HttpServletResponse response, String template, HashMap<String, Object> root) {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; Charset=utf-8");

        Configuration cfg = ConfigSingleton.getConfig(request.getServletContext());
        Template tmpl = null;
        try {
            tmpl = cfg.getTemplate(template);
            tmpl.process(root, response.getWriter());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

}
