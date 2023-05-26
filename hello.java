    @RequestMapping("/admin/models/new")
    public String AddNewModel(Model model) {
        Modelling modelling = new Modelling();
        model.addAttribute("model", modelling);
        return "Admin/new_model";

    }

    @RequestMapping("/admin/models/save")
    public String saveModel(@ModelAttribute("model") Modelling modelling) {
        service.save_modelling(modelling);
        return "redirect:/admin/models";
    }

    
    @RequestMapping("/admin/models/delete/{id}")
    public String deleteModel(@PathVariable(name ="id") Long id) {
        service.delete_modelling(id);
        return "redirect:/admin/models";
    }
