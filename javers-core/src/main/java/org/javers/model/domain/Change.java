package org.javers.model.domain;

import org.javers.model.domain.changeType.ReferenceChanged;
import org.javers.model.domain.changeType.ValueChange;

import static org.javers.common.validation.Validate.argumentIsNotNull;

/**
 * Change represents <b>atomic</b> difference between two objects.
 * <br/><br/>
 *
 * There are several change types: {@link ValueChange}, {@link ReferenceChanged}, ...
 * For complete list see inheritance hierarchy.
 * <br/><br/>
 *
 * Change is a <i>Value Object</i> and typically can not exists without
 * owning {@link Diff}. For more information see {@link Diff} javadoc.

 *
 * @author bartosz walacik
 */
public abstract class Change {
    private final Diff parent;
    private final GlobalCdoId globalCdoId;

    protected Change(GlobalCdoId globalCdoId, Diff parent) {
        argumentIsNotNull(globalCdoId);
        argumentIsNotNull(parent);
        this.globalCdoId = globalCdoId;
        this.parent = parent;
    }

    /**
     * Affected object
     */
    public GlobalCdoId getGlobalCdoId() {
        return globalCdoId;
    }

    /**
     * Owning aggregate
     */
    public Diff getParent() {
        return parent;
    }
}
