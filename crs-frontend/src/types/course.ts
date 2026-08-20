// path: crs-frontend/src/types/course.ts
export interface Course {
    id: number;
    tenMonHoc: string;
    soTinChi: number;
    soChoToiDa: number;
    soChoConLai: number;
}

// Khop voi cau truc Page<CourseDTO> ma Spring Data JPA tra ve
export interface PagedResponse<T> {
    content: T[];
    totalElements: number;
    totalPages: number;
    number: number;
    size: number;
}