package presenter;

import notebook.Service;
import ui.View;

public class Presenter {
    private View view;
    private Service service;

    public Service getService() {
        return service;
    }

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addNote(String note) {
        service.addNote(note);
    }

    public String print(){
        return service.toString();
    }

}
