package net.md_5.bungee.api.event;

// Event for logging Off / Disconnecting

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.plugin.Event;


@Data
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)

public class LeaveEvent extends AsyncEvent<LeaveEvent> implements Event
{


// Connection attempting to Leave

    private final PendingLeave leave;

    public LeaveEvent(PendingLeave leave, Callback<LeaveEvent> done)
    {
        super( done );
        this.leave = leave;
    }
}
