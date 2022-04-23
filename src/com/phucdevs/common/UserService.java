package com.phucdevs.common;

import com.phucdevs.object.Grade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Phuc.Le
 */
public class UserService {

    public static List<Grade> getGradesByEmptyList() {
        return Collections.emptyList();
    }

    public static List<Grade> getGradesByNewArrayList() {
        return new ArrayList<>();
    }
}
