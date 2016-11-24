package helpers;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletContext;

/**
 * Created by Alex on 14.11.2016.
 */
public class ConfigSingleton {
    private static Configuration cfg = null;
    public static Configuration getConfig(ServletContext sc) {
        if (cfg == null) {
            cfg = new Configuration();
            cfg.setServletContextForTemplateLoading(
                    sc,
                    "/WEB-INF/templates"
            );
            cfg.setTemplateExceptionHandler(
                    TemplateExceptionHandler.HTML_DEBUG_HANDLER
            );
        }
        return cfg;
    }
}