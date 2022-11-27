// Teresa Tull created this on 11-24-2022 work on ch 18

package org.launchcode.codingevents.models.dto;

import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.Tag;

import javax.validation.constraints.NotNull;

public class EventTagDTO {
    //Data Transfer Object

    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO() {
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

}
