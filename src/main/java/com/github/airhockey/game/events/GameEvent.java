/*
 * Developed by Boris Kozhuhovskiy (borisgk98@ya.ru) on 11.05.19 15:46.
 * airhockey
 */

package com.github.airhockey.game.events;

import com.github.airhockey.game.GameProcess;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class GameEvent {
    /**
     * Время в наносекундах, когда произошло событие
     */
    protected Long eventTime;
    public abstract void process(GameProcess p);

    public GameEvent(Long eventTime) {
        this.eventTime = eventTime;
    }
}
