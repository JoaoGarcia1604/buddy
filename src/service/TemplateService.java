package service;

import model.Item;
import model.JobTemplate;

import java.util.ArrayList;
import java.util.List;

public class TemplateService {

    private List<JobTemplate> templates = new ArrayList<>();

    public void createTemplate(String name){
        JobTemplate newTemplate = new JobTemplate(name);
        templates.add(newTemplate);
    }

    public void addToTemplate(int templateId, Item item){
        JobTemplate template = getTemplateById(templateId);
        template.addItem(item);
    }

    public List<JobTemplate> listTemplates(){
        return this.templates;
    }

    public JobTemplate getTemplateById(int id){
        for(JobTemplate template : templates){
            if(template.getId() == id){
                return template;
            }
        }
        throw new IllegalArgumentException("Template not found");
    }

}
